// Generated by delombok at Sun Nov 21 11:47:37 UTC 2021
package org.owasp.webgoat.password_reset.resetlink;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author nbaars
 * @since 8/18/17.
 */
public class PasswordChangeForm {
    @NotNull
    @Size(min = 6, max = 10)
    private String password;
    private String resetLink;

    @java.lang.SuppressWarnings("all")
    public String getPassword() {
        return this.password;
    }

    @java.lang.SuppressWarnings("all")
    public String getResetLink() {
        return this.resetLink;
    }

    @java.lang.SuppressWarnings("all")
    public void setPassword(final String password) {
        this.password = password;
    }

    @java.lang.SuppressWarnings("all")
    public void setResetLink(final String resetLink) {
        this.resetLink = resetLink;
    }
}
