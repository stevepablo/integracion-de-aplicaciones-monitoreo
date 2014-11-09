
package uade.fain.ia.tpo.interfaces.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7.redhat-1
 * 2014-11-08T16:36:54.606-03:00
 * Generated source version: 2.7.7.redhat-1
 */

@WebFault(name = "ArticuloDesconocidoException", targetNamespace = "http://soap.interfaces.tpo.ia.fain.uade/")
public class ArticuloDesconocidoExceptionException extends java.lang.Exception {
    
    private uade.fain.ia.tpo.interfaces.soap.ArticuloDesconocidoException articuloDesconocidoException;

    public ArticuloDesconocidoExceptionException() {
        super();
    }
    
    public ArticuloDesconocidoExceptionException(String message) {
        super(message);
    }
    
    public ArticuloDesconocidoExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArticuloDesconocidoExceptionException(String message, uade.fain.ia.tpo.interfaces.soap.ArticuloDesconocidoException articuloDesconocidoException) {
        super(message);
        this.articuloDesconocidoException = articuloDesconocidoException;
    }

    public ArticuloDesconocidoExceptionException(String message, uade.fain.ia.tpo.interfaces.soap.ArticuloDesconocidoException articuloDesconocidoException, Throwable cause) {
        super(message, cause);
        this.articuloDesconocidoException = articuloDesconocidoException;
    }

    public uade.fain.ia.tpo.interfaces.soap.ArticuloDesconocidoException getFaultInfo() {
        return this.articuloDesconocidoException;
    }
}
