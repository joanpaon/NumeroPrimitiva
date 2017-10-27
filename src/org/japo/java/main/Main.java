/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - joanpon@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto Scanner
        Scanner scn = new Scanner(System.in);

        // Variable
        int numero;

        try {
            // Tirada
            System.out.print("Número Primitiva ..: ");
            numero = scn.nextInt();
            scn.nextLine();

            // Mensaje
            System.out.printf("Número Primitiva ..: %d\n", numero);
        } catch (Exception e) {
            System.out.println("Error de entrada");
            scn.nextLine();
        }
    }
}
