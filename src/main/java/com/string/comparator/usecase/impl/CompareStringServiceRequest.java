package com.string.comparator.usecase.impl;

import com.string.comparator.usecase.ICompareStringRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CompareStringServiceRequest implements ICompareStringRequest {

    @Override
    public boolean doExecute(String S1, String posibleAnagrama) {
            S1 = S1.replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
            posibleAnagrama = posibleAnagrama.replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
            S1 = ordenar(S1);
            posibleAnagrama = ordenar(posibleAnagrama);
            return S1.equals(posibleAnagrama);
    }

        public  String ordenar(String S1) {
            char[] caracteres = S1.toCharArray();
            Arrays.sort(caracteres);
            return new String(caracteres);
        }

}
