package org.zab.services;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;
import org.zab.entities.Network;
import org.zab.entities.Node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Service
public class NetworkService {

    public Network parse_configuration(String configPath) throws FileNotFoundException {
        Network network = new Network();

        Yaml yaml = new Yaml();

        // Parse created configuration in order to get peers addresses and ids
        InputStream inputStream = new FileInputStream(configPath);

        HashMap yamlMap = yaml.load(inputStream);
        HashMap services = (HashMap) yamlMap.get("services");
        for (Object m: services.values()) {
            LinkedHashMap<String, String> peer = (LinkedHashMap) m;
            if (peer.get("container_name").contains("client")){
                continue;
            }
            Long peerId = Long.valueOf(peer.get("command").split(" ")[1]);
            String peerPort = String.valueOf(peer.get("ports")).substring(1, 6);
            Node newNode = new Node();
            newNode.setId(peerId);
            network.addNode(newNode, peerPort);
        }

        return network;
    }
}
