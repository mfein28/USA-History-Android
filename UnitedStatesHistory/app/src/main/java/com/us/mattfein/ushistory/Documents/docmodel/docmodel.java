package com.us.mattfein.ushistory.Documents.docmodel;

public class docmodel{


        private  int imageId;
        private String docName;


        public docmodel(int imageId, String docName) {
            this.imageId = imageId;
            this.docName = docName;


        }

        public int getImageId() {
            return imageId;
        }

        public void setEraName(String docName){
            this.docName = docName;
        }

        public void setImageId(int imageId) {
            this.imageId = imageId;
        }

        public String getEraName() {
            return docName;
        }


    }

