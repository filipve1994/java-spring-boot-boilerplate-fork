package com.mewebstudio.javaspringbootboilerplate.dto.request.user;

import com.mewebstudio.javaspringbootboilerplate.dto.annotation.FieldMatch;
import com.mewebstudio.javaspringbootboilerplate.dto.annotation.Password;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@FieldMatch(first = "password", second = "passwordConfirm", message = "{password_mismatch}")
public abstract class AbstractBaseCreateUserRequest {
    @NotBlank(message = "{not_blank}")
    @Email(message = "{invalid_email}")
    @Size(max = 100, message = "{max_length}")
    @Schema(
        name = "email",
        description = "Email of the user",
        type = "String",
        requiredMode = Schema.RequiredMode.REQUIRED,
        example = "mail@example.com"
    )
    private String email;

    @NotBlank(message = "{not_blank}")
    @Password(message = "{invalid_password}")
    @Schema(
        name = "password",
        description = "Password of the user",
        type = "String",
        requiredMode = Schema.RequiredMode.REQUIRED,
        example = "P@sswd123."
    )
    private String password;

    @NotBlank(message = "{not_blank}")
    @Schema(
        name = "passwordConfirm",
        description = "Password for confirmation",
        type = "String",
        requiredMode = Schema.RequiredMode.REQUIRED,
        example = "P@sswd123."
    )
    private String passwordConfirm;

    @NotBlank(message = "{not_blank}")
    @Size(max = 50, message = "{max_length}")
    @Schema(
        name = "username",
        description = "User's userName",
        type = "String",
        requiredMode = Schema.RequiredMode.REQUIRED,
        example = "JohnD"
    )
    private String username;

    @NotBlank(message = "{not_blank}")
    @Size(max = 50, message = "{max_length}")
    @Schema(
            name = "firstName",
            description = "User's first Name",
            type = "String",
            requiredMode = Schema.RequiredMode.REQUIRED,
            example = "John"
    )
    private String firstName;

    @NotBlank(message = "{not_blank}")
    @Size(max = 50, message = "{max_length}")
    @Schema(
        name = "lastName",
        description = "Lastname of the user",
        type = "String",
        requiredMode = Schema.RequiredMode.REQUIRED,
        example = "DOE"
    )
    private String lastName;

    @NotBlank(message = "{not_blank}")
    @Size(max = 50, message = "{max_length}")
    @Schema(
            name = "dateOfBirth",
            description = "User's Date of Birth",
            type = "String",
            requiredMode = Schema.RequiredMode.REQUIRED,
            example = "1/1/1980"
    )
    private String dateOfBirth;

    @NotBlank(message = "{not_blank}")
    @Size(max = 50, message = "{max_length}")
    @Schema(
            name = "gender",
            description = "User's Gender",
            type = "String",
            requiredMode = Schema.RequiredMode.REQUIRED,
            example = "Male"
    )
    private String gender;
}
