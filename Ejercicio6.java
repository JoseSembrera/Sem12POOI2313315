import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    protected List<Node> nodes;

    public Main() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void removeNode(Node node) {
        nodes.remove(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public abstract void configureNetwork();

    public abstract void setPacketSize(int size);

    public abstract void sendPacket(Node sender, Node receiver, String data);

    public abstract void broadcastPacket(Node sender, String data);

    public abstract void performStatistics();
}

class Main {
    protected String nodeName;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }
}

class Main extends LAN {
    @Override
    public void configureNetwork() {
    }

    @Override
    public void setPacketSize(int size) {
    }

    @Override
    public void sendPacket(Node sender, Node receiver, String data) {
    }

    @Override
    public void broadcastPacket(Node sender, String data) {
    }

    @Override
    public void performStatistics() {
    }
}

class Main extends LAN {
}


public class Main {
    public static void main(String[] args) {
        Main starLAN = new Main();
        Main node1 = new Main("Node1");
        Main node2 = new Main("Node2");

        starLAN.addNode(node1);
        starLAN.addNode(node2);

        starLAN.configureNetwork();
        starLAN.setPacketSize(1024);
        starLAN.sendPacket(node1, node2, "Hello, Node2!");
        starLAN.broadcastPacket(node1, "Broadcast message!");

        starLAN.performStatistics();
    }
}
