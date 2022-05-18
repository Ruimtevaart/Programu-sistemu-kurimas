package lt.vu.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Specializes;
import lt.vu.interceptors.Logger;

@Specializes
@ApplicationScoped
public class NameSemicolonChecker extends NameSlashChecker {

  @Override
  @Logger
  public boolean containsSlash(String name) {
    return name.matches(".*[;].*");
  }

}
