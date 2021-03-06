/*
 * Colormatic
 * Copyright (C) 2019  Thalia Nero
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.kvverti.colormatic.properties;

import io.github.kvverti.colormatic.properties.ColormapProperties;

import net.minecraft.client.texture.NativeImage;

/**
 * Biome properties with their associated colormap image.
 */
public class PropertyImage {

    public final ColormapProperties properties;
    public final NativeImage image;

    public PropertyImage(ColormapProperties p, NativeImage i) {
        properties = p;
        image = i;
    }
}
