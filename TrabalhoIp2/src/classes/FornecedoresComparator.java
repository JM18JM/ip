package classes;

import java.util.Comparator;

public class FornecedoresComparator implements Comparator<Fornecedores> {
    @Override
    public int compare(Fornecedores fornecedor1, Fornecedores fornecedor2) {
        return Integer.compare(fornecedor1.qtArtigos, fornecedor2.qtArtigos);
    }
}
