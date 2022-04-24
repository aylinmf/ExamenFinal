package com.example.examenfinal.configuracion;


import java.io.Serializable;

    public class medicamento implements Serializable {

        private int id;
        private String descripcion;
        private String cantidad;
        private String tiempo;
        private String reprocidad;
        private String imagen;

        public medicamento(int id, String descripcion, String cantidad, String tiempo, String reprocidad, String imagen) {
            this.id = id;
            this.descripcion = descripcion;
            this.cantidad = cantidad;
            this.tiempo = tiempo;
            this.reprocidad =
                    reprocidad;
            this.imagen = imagen;
        }

        public medicamento(){}


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCantidad() {
            return cantidad;
        }

        public void setCantidad(String cantidad) {
            this.cantidad = cantidad;
        }

        public String getTiempo() {
            return tiempo;
        }

        public void setTiempo(String tiempo) {
            this.tiempo = tiempo;
        }

        public String getReprocidad() {
            return reprocidad;
        }

        public void setReprocidad(String reprocidad) {
            this.reprocidad = reprocidad;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public String getTerminacion(){
            String terminacion=""+
                    tiempo.charAt(tiempo.length()-4)+
                    tiempo.charAt(tiempo.length()-3)+
                    tiempo.charAt(tiempo.length()-2)
                    ;

            return terminacion;
        }

        public String getMedicamentoString() {
            return descripcion+"   "+"+"+getTerminacion()+cantidad;
        }


        public String getmedi() {
            return "tel:+"+getTerminacion()+" "+cantidad;
        }

        @Override
        public String toString() {
            return  descripcion + " | " + cantidad;
        }
    }

