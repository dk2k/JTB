/* Generated by JTB 1.5.1 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.processing.SupportedAnnotationTypes;

@SuppressWarnings({"javadoc","unused"})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface NodeFieldsSignature {

  int[] value();

}