package tortora.junit;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexao");
    }

    public static void insertData(Pessoa pessoa) {
        LOGGER.info("Inseriu dados");
    }

    public static void removeData(Pessoa pessoa) {
        LOGGER.info("Removeu dados");
    }

}
