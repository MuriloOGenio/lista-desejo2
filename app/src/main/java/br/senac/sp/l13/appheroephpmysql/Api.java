package br.senac.sp.l13.appheroephpmysql;

public class Api {

    private static final String ROOT_URL = "http://10.67.96.195/Lista_Desejos_Api/v1/Api.php?apicall=";

    public static final String URL_CREATE_DESEJO = ROOT_URL + "createdesejo";
    public static final String URL_READ_DESEJOS = ROOT_URL + "getdesejos";
    public static final String URL_UPDATE_DESEJO = ROOT_URL + "updatedesejo";
    public static final String URL_DELETE_DESEJO = ROOT_URL + "deletedesejo&id=";
}
