# Micronaut static resources / views app #

:warning: **The master branch is not used anymore**. Checkout branches for each specific view technology: `freemarker`, `handlebars`, `thymeleaf` and `velocity` and micronaut versions.

Test application for Micronaut and GraalVM that:

- Exposes static content in http://localhost:8080
- Returns a `ModelAndView` to render HTML in http://localhost:8080/views/${technology}
- Uses `@View` to render HTML in http://localhost:8080/views/${technology}-view
