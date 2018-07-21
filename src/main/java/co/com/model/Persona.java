/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author user
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
public class Persona {
    @NonNull private String nombre;
    @EqualsAndHashCode.Exclude private String   apellidos;
    @EqualsAndHashCode.Exclude private int edad;
}
