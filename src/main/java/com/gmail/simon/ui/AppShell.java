package com.gmail.simon.ui;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.server.PWA;

import static com.gmail.simon.ui.utils.BakeryConst.VIEWPORT;

@Viewport(VIEWPORT)
@PWA(name = "Bakery App Starter", shortName = "Analyse & Design - Kirk Larsen",
		startPath = "login",
		backgroundColor = "#227aef", themeColor = "#227aef",
		offlinePath = "offline-page.html",
		offlineResources = {"images/offline-login-banner.jpg"})
public class AppShell implements AppShellConfigurator {
}
