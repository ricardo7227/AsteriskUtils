/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.validacion.RequiredFieldException;
import utilidades.validacion.Validator;


/**
 *
 * @author daw
 */
public class ValidadorServicios {

    public ValidadorServicios() {
    }

    public boolean validateModel(Object model) {
        boolean isValid = true;
        try {
            Validator.validateForNulls(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ValidadorServicios.class.getName()).log(Level.SEVERE, null, ex);
            isValid = false;
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(ValidadorServicios.class.getName()).log(Level.SEVERE, null, ex);
            isValid = false;
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ValidadorServicios.class.getName()).log(Level.SEVERE, null, ex);
            isValid = false;
        } catch (RequiredFieldException ex) {
            Logger.getLogger(ValidadorServicios.class.getName()).log(Level.SEVERE, null, ex);
            isValid = false;
        }
        return isValid;
    }

}
