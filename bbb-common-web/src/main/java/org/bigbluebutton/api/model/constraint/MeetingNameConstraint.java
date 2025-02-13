package org.bigbluebutton.api.model.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotEmpty(message = "You must provide a meeting name")
@Size(min = 2, max = 256, message = "Meeting name must be between 2 and 256 characters")
@Pattern(regexp = "^[^,]+$", message = "Meeting name cannot contain ','")
@Constraint(validatedBy = {})
@Target(FIELD)
@Retention(RUNTIME)
public @interface MeetingNameConstraint {

    String message() default "Invalid meeting name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
