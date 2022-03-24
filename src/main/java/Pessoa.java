import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimiento;

    public Pessoa(String nome, LocalDateTime nascimiento) {
        this.nome = nome;
        this.nascimiento = nascimiento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getNascimiento() {
        return nascimiento;
    }

    public void setNascimiento(LocalDateTime nascimiento) {
        this.nascimiento = nascimiento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimiento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }





}
