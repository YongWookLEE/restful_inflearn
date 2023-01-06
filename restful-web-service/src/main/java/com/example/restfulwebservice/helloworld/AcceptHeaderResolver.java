package com.example.restfulwebservice.helloworld;

import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * AcceptHeaderResolver.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.05
 */
public class AcceptHeaderResolver extends AcceptHeaderLocaleResolver {
    List<Locale> LOCALES = Arrays.asList(new Locale("en"), new Locale("ar"));

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String headerLang = request.getHeader("Accept-Language");
        return headerLang == null || headerLang.isEmpty()
                ? Locale.getDefault()
                : Locale.lookup(Locale.LanguageRange.parse(headerLang), LOCALES);
    }

}
