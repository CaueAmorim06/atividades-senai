import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Farol");
        listaParaIlhaDeserta.add("Brand New City");
        listaParaIlhaDeserta.add("Helipa");
        listaParaIlhaDeserta.add("DAMN");
        listaParaIlhaDeserta.add("Tocaia");
        listaParaIlhaDeserta.add("Last Dance");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove(2);
        System.out.println(listaParaIlhaDeserta.size());
        String musica = listaParaIlhaDeserta.get(0);
        listaParaIlhaDeserta.set(listaParaIlhaDeserta.indexOf(musica), listaParaIlhaDeserta.get(1));
        listaParaIlhaDeserta.set(1, musica);
        System.out.println(listaParaIlhaDeserta);
        

    }

    
}
