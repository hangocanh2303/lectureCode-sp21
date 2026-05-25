import java.util.Iterator;
public class OHQueue implements Iterable<OHRequest> {
    private OHRequest ohRequest;
    public OHQueue (OHRequest queue) {
        ohRequest = queue;
    }

    @Override
    public Iterator<OHRequest> iterator() {
        return new OHIterator(ohRequest);
    }

    public static void main(String [] args) {
        OHRequest s5 = new OHRequest("I deleted all of my files", "Allyson", null);
        OHRequest s4 = new OHRequest("conceptual: what is Java", "Omar", s5);
        OHRequest s3 = new OHRequest("git: I never did lab 1", "Connor", s4);
        OHRequest s2 = new OHRequest("help", "Hug", s3);
        OHRequest s1 = new OHRequest("no I haven't tried stepping through", "Itai", s2);
        OHQueue ohQueue = new OHQueue(s1);
        for (OHRequest oh : ohQueue) {
            System.out.println(oh.name);
        }
    }


}

