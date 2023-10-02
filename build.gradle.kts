group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    controllerOptions.add("SUSPEND_MODIFIER")
}
