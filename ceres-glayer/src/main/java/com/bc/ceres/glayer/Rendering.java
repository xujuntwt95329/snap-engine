package com.bc.ceres.glayer;

import java.awt.*;


/**
 * A rendering is used to render a {@link GraphicalLayer} to a GUI widget, printer or image.
 * The part of the layer to be rendered is specified by the {@link Viewport}.
 */
public interface Rendering {

    /**
     * @return The graphics context associated with this view.
     */
    Graphics2D getGraphics();

    /**
     * @return The port through which the layer is viewed.
     */
    Viewport getViewport();


    /**
     * @return The (visible) region of the rendering in device coordinates.
     */
    Rectangle getBounds();
}
