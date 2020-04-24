package com.mycompany.tabelas;
import java.util.List;
import java.util.Objects;

public class Localizacao {
    private Integer id_localizacao;
    private String nome_localizacao;
    private String tipo_linha;
    private String endereco;
    private Integer total_maquina;
    private List<Maquina> maquinas;
    private Usuario usuario;

    public Localizacao(Integer id_localizacao, String nome_localizacao, String tipo_linha, String endereco, Integer total_maquina, List<Maquina> maquinas, Usuario usuario) {
        this.id_localizacao = id_localizacao;
        this.nome_localizacao = nome_localizacao;
        this.tipo_linha = tipo_linha;
        this.endereco = endereco;
        this.total_maquina = total_maquina;
        this.maquinas = maquinas;
        this.usuario = usuario;
    }
    
   

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public Localizacao() {
    }

    public Integer getId_localizacao() {
        return id_localizacao;
    }

    public void setId_localizacao(Integer id_localizacao) {
        this.id_localizacao = id_localizacao;
    }

    public String getNome_localizacao() {
        return nome_localizacao;
    }

    public void setNome_localizacao(String nome_localizacao) {
        this.nome_localizacao = nome_localizacao;
    }

    public String getTipo_linha() {
        return tipo_linha;
    }

    public void setTipo_linha(String tipo_linha) {
        this.tipo_linha = tipo_linha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTotal_maquina() {
        return total_maquina;
    }

    public void setTotal_maquina(Integer total_maquina) {
        this.total_maquina = total_maquina;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id_localizacao);
        hash = 47 * hash + Objects.hashCode(this.nome_localizacao);
        hash = 47 * hash + Objects.hashCode(this.tipo_linha);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.total_maquina);
        hash = 47 * hash + Objects.hashCode(this.maquinas);
        hash = 47 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Localizacao other = (Localizacao) obj;
        if (!Objects.equals(this.nome_localizacao, other.nome_localizacao)) {
            return false;
        }
        if (!Objects.equals(this.tipo_linha, other.tipo_linha)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.id_localizacao, other.id_localizacao)) {
            return false;
        }
        if (!Objects.equals(this.total_maquina, other.total_maquina)) {
            return false;
        }
        if (!Objects.equals(this.maquinas, other.maquinas)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "id_localizacao=" + id_localizacao + ", nome_localizacao=" + nome_localizacao + ", tipo_linha=" + tipo_linha + ", endereco=" + endereco + ", total_maquina=" + total_maquina + ", maquinas=" + maquinas + ", usuario=" + usuario + '}';
    }

    
}
