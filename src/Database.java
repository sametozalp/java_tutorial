
// eğer class final olursa hiçbir şekilde kendisinden alt sınıf üretemeyiz

public class Database {

    public void baglantiKur(final String username, final String password) {
        // username = "root2"; final olduğu için değiştirilemez
        System.out.println(username);
        System.out.println(password);
    }

    // eğer metotlarda final kullanılırsa bu da demek oluyor ki kalıtım yoluyla
    // extend etse bile override edemiyoruz

    /*
     * public final void baglantiKur(final String username, final String password) {
     * System.out.println(username);
     * System.out.println(password);
     * }
     */
}
