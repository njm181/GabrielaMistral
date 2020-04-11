
package com.example.gabrielamistral.model.response;

import java.util.List;

import com.example.gabrielamistral.model.Devocional;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAllDevocionales {

    @SerializedName("devocional")
    @Expose
    private List<Devocional> devocional = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseAllDevocionales() {
    }

    /**
     * 
     * @param devocional
     */
    public ResponseAllDevocionales(List<Devocional> devocional) {
        super();
        this.devocional = devocional;
    }

    public List<Devocional> getDevocional() {
        return devocional;
    }

    public void setDevocional(List<Devocional> devocional) {
        this.devocional = devocional;
    }

}
