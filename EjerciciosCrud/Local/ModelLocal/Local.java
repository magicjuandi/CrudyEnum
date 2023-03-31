package com.EjerciciosCrud.Local.ModelLocal;

public class Local {
    public Integer NumLocal;
    private String name;
    private String category;
    private String phone;
    
    public Local(Integer numLocal, String name, String category, String phone) {
        NumLocal = numLocal;
        this.name = name;
        this.category = category;
        this.phone = phone;
    }

    public Integer getNumLocal() {
        return NumLocal;
    }

    public void setNumLocal(Integer numLocal) {
        NumLocal = numLocal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Local [NumLocal=" + NumLocal + ", name=" + name + ", category=" + category + ", phone=" + phone + "]";
    }



    
}

