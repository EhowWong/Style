package net.cassite.style;

import net.cassite.style.interfaces.RFunc1;

/**
 * Interface of classes to tramsform an array or an iterable object into another
 * array
 * 
 * @author wkgcass
 *
 * @param <R>
 *                returned array type
 * @param <T>
 *                input array/iterable type
 */
public interface A1ArrTransformer<R, T> extends var {
        /**
         * define the transform process
         * 
         * @param method
         *                a function takes in each object from the
         *                array/iterable and returns it's transformed state.
         * @return an array with objects after the transform
         */
        default R[] via(RFunc1<R, T> method) {
                return via($(method));
        }

        /**
         * define the transform process
         * 
         * @param method
         *                a function takes in each object from the
         *                array/iterable and returns it's transformed state.
         * @return an array with objects after the transform
         */
        R[] via(def<R> method);
}
