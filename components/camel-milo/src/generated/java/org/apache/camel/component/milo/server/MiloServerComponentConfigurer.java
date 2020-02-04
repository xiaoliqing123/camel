/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.server;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MiloServerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "namespaceUri": ((MiloServerComponent) target).setNamespaceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((MiloServerComponent) target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationUri": ((MiloServerComponent) target).setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "productUri": ((MiloServerComponent) target).setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "bindPort": ((MiloServerComponent) target).setBindPort(property(camelContext, int.class, value)); return true;
        case "strictEndpointUrlsEnabled": ((MiloServerComponent) target).setStrictEndpointUrlsEnabled(property(camelContext, boolean.class, value)); return true;
        case "serverName": ((MiloServerComponent) target).setServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "hostname": ((MiloServerComponent) target).setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "securityPolicies": ((MiloServerComponent) target).setSecurityPolicies(property(camelContext, java.util.Set.class, value)); return true;
        case "securityPoliciesById": ((MiloServerComponent) target).setSecurityPoliciesById(property(camelContext, java.util.Collection.class, value)); return true;
        case "userAuthenticationCredentials": ((MiloServerComponent) target).setUserAuthenticationCredentials(property(camelContext, java.lang.String.class, value)); return true;
        case "enableAnonymousAuthentication": ((MiloServerComponent) target).setEnableAnonymousAuthentication(property(camelContext, boolean.class, value)); return true;
        case "usernameSecurityPolicyUri": ((MiloServerComponent) target).setUsernameSecurityPolicyUri(property(camelContext, org.eclipse.milo.opcua.stack.core.security.SecurityPolicy.class, value)); return true;
        case "bindAddresses": ((MiloServerComponent) target).setBindAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "buildInfo": ((MiloServerComponent) target).setBuildInfo(property(camelContext, org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo.class, value)); return true;
        case "serverCertificate": ((MiloServerComponent) target).setServerCertificate(property(camelContext, org.apache.camel.component.milo.KeyStoreLoader.Result.class, value)); return true;
        case "certificateManager": ((MiloServerComponent) target).setCertificateManager(property(camelContext, org.eclipse.milo.opcua.stack.core.application.CertificateManager.class, value)); return true;
        case "certificateValidator": ((MiloServerComponent) target).setCertificateValidator(property(camelContext, java.util.function.Supplier.class, value)); return true;
        case "defaultCertificateValidator": ((MiloServerComponent) target).setDefaultCertificateValidator(property(camelContext, java.io.File.class, value)); return true;
        case "basicPropertyBinding": ((MiloServerComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((MiloServerComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((MiloServerComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "namespaceuri": ((MiloServerComponent) target).setNamespaceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((MiloServerComponent) target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationuri": ((MiloServerComponent) target).setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "producturi": ((MiloServerComponent) target).setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "bindport": ((MiloServerComponent) target).setBindPort(property(camelContext, int.class, value)); return true;
        case "strictendpointurlsenabled": ((MiloServerComponent) target).setStrictEndpointUrlsEnabled(property(camelContext, boolean.class, value)); return true;
        case "servername": ((MiloServerComponent) target).setServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "hostname": ((MiloServerComponent) target).setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "securitypolicies": ((MiloServerComponent) target).setSecurityPolicies(property(camelContext, java.util.Set.class, value)); return true;
        case "securitypoliciesbyid": ((MiloServerComponent) target).setSecurityPoliciesById(property(camelContext, java.util.Collection.class, value)); return true;
        case "userauthenticationcredentials": ((MiloServerComponent) target).setUserAuthenticationCredentials(property(camelContext, java.lang.String.class, value)); return true;
        case "enableanonymousauthentication": ((MiloServerComponent) target).setEnableAnonymousAuthentication(property(camelContext, boolean.class, value)); return true;
        case "usernamesecuritypolicyuri": ((MiloServerComponent) target).setUsernameSecurityPolicyUri(property(camelContext, org.eclipse.milo.opcua.stack.core.security.SecurityPolicy.class, value)); return true;
        case "bindaddresses": ((MiloServerComponent) target).setBindAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "buildinfo": ((MiloServerComponent) target).setBuildInfo(property(camelContext, org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo.class, value)); return true;
        case "servercertificate": ((MiloServerComponent) target).setServerCertificate(property(camelContext, org.apache.camel.component.milo.KeyStoreLoader.Result.class, value)); return true;
        case "certificatemanager": ((MiloServerComponent) target).setCertificateManager(property(camelContext, org.eclipse.milo.opcua.stack.core.application.CertificateManager.class, value)); return true;
        case "certificatevalidator": ((MiloServerComponent) target).setCertificateValidator(property(camelContext, java.util.function.Supplier.class, value)); return true;
        case "defaultcertificatevalidator": ((MiloServerComponent) target).setDefaultCertificateValidator(property(camelContext, java.io.File.class, value)); return true;
        case "basicpropertybinding": ((MiloServerComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((MiloServerComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((MiloServerComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
