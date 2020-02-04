/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spring.integration;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SpringIntegrationEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "inOut": ((SpringIntegrationEndpoint) target).setInOut(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((SpringIntegrationEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "inputChannel": ((SpringIntegrationEndpoint) target).setInputChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((SpringIntegrationEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SpringIntegrationEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((SpringIntegrationEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputChannel": ((SpringIntegrationEndpoint) target).setOutputChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((SpringIntegrationEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SpringIntegrationEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "inout": ((SpringIntegrationEndpoint) target).setInOut(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((SpringIntegrationEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "inputchannel": ((SpringIntegrationEndpoint) target).setInputChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((SpringIntegrationEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SpringIntegrationEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((SpringIntegrationEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputchannel": ((SpringIntegrationEndpoint) target).setOutputChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((SpringIntegrationEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SpringIntegrationEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
