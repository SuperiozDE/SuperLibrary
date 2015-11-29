package de.superioz.library.minecraft.server.common.inventory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This class was created as a part of SuperLibrary
 *
 * @author Superioz
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InventoryContent {

    boolean fill() default false;

}
