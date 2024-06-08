package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultiFuncionnal;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncionnal em = new EquipamentoMultiFuncionnal();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
