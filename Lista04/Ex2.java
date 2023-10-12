package Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {
	
	public static void main(String[] args) throws ParseException {
		Ex2 contato = new Ex2();
		
		contato.inicializarContato("Guilherme", "guilhermeiief", "73991294131", "12/04/2004");
		contato.imprimirContato();
	}
	
    private String nome;
    private String email;
    private String telefone;
    private Date dataNascimento;

    
    public void inicializarContato(String nome, String email, String telefone, String dataNascimento) throws ParseException {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = data.parse(dataNascimento);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento));
    }

    
    public int calcularIdade() {
        Date dataAtual = new Date();
        long diff = dataAtual.getTime() - dataNascimento.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365.25));
    }
}

