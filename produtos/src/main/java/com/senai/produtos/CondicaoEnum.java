package com.senai.produtos;

public enum CondicaoEnum {
        NOVO("Novo"),
        USADO("Usado"),
        SEMI_NOVO("Semi novo");

        private String condicao;

        private CondicaoEnum(String condicao) {
            this.condicao = condicao;
        }

        public String getCondicao() {
            return this.condicao;
        }

    }
