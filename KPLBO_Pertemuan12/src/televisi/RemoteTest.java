package televisi;

public class RemoteTest {
    public static void main(String[] args) {
        SonyTv tv = new SonyTv();
        RemoteTv remote = new RemoteTv(tv);

        SamsungTv tvs = new SamsungTv();
        RemoteTv remote2 = new RemoteTv(tvs);

        remote.pindahChannel(0);
        remote.pindahChannel(2);
        remote.pindahChannel(4);
        remote.pindahChannel(10);
        System.out.println("--------------------");
        remote2.pindahChannel(0);
        remote2.pindahChannel(2);
        remote2.pindahChannel(4);
        remote2.pindahChannel(10);
    }
}
