public class Tm extends Aday {

    public Tm(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int puanHesapla() {
        // TODO Auto-generated method stub
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}
