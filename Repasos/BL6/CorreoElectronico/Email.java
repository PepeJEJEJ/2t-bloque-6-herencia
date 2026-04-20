package CorreoElectronico;

public class Email {
    private String correo;
    private String contrasenia;

    public Email(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public boolean EsSegura() {
        boolean resultado = false;
        boolean tieneLetras = false;
        boolean tieneNumeros = false;
        if (contrasenia.length() >= 6) {
            for (int i = 0; i < contrasenia.length() - 1; i++) {
                if (contrasenia.substring(i, i + 1).equals("0")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("1")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("2")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("3")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("4")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("5")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("6")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("7")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("8")) {
                    tieneNumeros = true;
                } else if (contrasenia.substring(i, i + 1).equals("9")) {
                    tieneNumeros = true;
                } else {
                    tieneLetras = true;
                }
            }
            if (tieneNumeros == true && tieneLetras == true) {
                resultado = true;
            }
        }
        return resultado;
    }
}
