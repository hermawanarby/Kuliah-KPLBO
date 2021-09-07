package televisi;

public class RemoteTv {
    private final Televisi tv;

    public RemoteTv(Televisi tv) {
        this.tv = tv;
    }

    public void pindahChannel(int nomor) {
        tv.pindahSaluran(nomor);
    }
}