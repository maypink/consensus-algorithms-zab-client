package org.zab.entities;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Network {

    private List<Node> nodes;

    private List<String> addresses;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public void addNode(Node node, String address){
        this.nodes.add(node);
        this.addresses.add(address);
    }
}