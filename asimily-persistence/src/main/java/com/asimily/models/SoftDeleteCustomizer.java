package com.asimily.models;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;

public class SoftDeleteCustomizer implements DescriptorCustomizer  {
  public void customize(ClassDescriptor descriptor) {
    descriptor.getQueryManager().setDeleteSQLString("Update raw_on_prem.network_info set processing_state = 0 where id = #id");
    
  }
}
