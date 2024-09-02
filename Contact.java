public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // Construtor para inicializar os atributos
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters para acessar os atributos
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Método toString para exibir informações do contato
    @Override
    public String toString() {
        return name + " - " + phoneNumber + " - " + email;
    }
}
