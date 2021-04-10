/*
 * La la la
 */
package io.rosmof.os;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class LighthouseApp {

    public static void main(String[] args) {
        System.setProperty("GOOGLE_APPLICATION_CREDENTIALS", "/os-serbia-quarkus-230c7930f9c7.json");
        Quarkus.run(args);
    }
}
