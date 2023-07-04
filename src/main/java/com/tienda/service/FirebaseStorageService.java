
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
   public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
   final String BucketName = "techshop-1d3ad.appspot.com";
   
   final String rutaSuperiorStorage = "techshop";
   
   final String rutaJsonFile = "firebase";
   
   final String archivoJsonFile = "techshop-1d3ad-firebase-adminsdk-jy2rm-4e91a26c76";
}
