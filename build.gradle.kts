group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    controllerOptions.add("SUSPEND_MODIFIER")
}

dependencies {
    openapi("com.projectronin.rest.contract:ronin-contract-shared-v1:1.0.0")
}
