package list;

public class Tarefa {
    private String descrcao;

    public Tarefa(String descrcao) {
        this.descrcao = descrcao;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    @Override
    public String toString() {
        return  descrcao;
    }
}
