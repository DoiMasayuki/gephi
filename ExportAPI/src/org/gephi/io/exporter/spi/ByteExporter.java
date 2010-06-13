/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gephi.io.exporter.spi;

import java.io.OutputStream;

/**
 *
 * @author Mathieu Bastian
 */
public interface ByteExporter extends Exporter {

    /**
     * Set the stream where to export.
     * @param stream      the stream the exporter is to write
     */
    public void setOutputStream(OutputStream stream);
}
