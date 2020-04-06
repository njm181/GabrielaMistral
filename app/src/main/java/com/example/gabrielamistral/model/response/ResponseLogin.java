
package com.example.gabrielamistral.model.response;

import java.util.List;

import com.example.gabrielamistral.model.Usuario;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseLogin {

    @SerializedName("usuario")
    @Expose
    private List<Usuario> usuario = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseLogin() {
    }

    /**
     * 
     * @param usuario
     */
    public ResponseLogin(List<Usuario> usuario) {
        super();
        this.usuario = usuario;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

}
