package com.aem.assignment.pwc.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * @author sakshi.arya
 * 
 *         Model class to return Show Hide multifield values
 *
 */
@Model(adaptables = { Resource.class })
public interface ShowHideModel {

	@ChildResource(injectionStrategy = InjectionStrategy.OPTIONAL, name = "names")
	List<Name> getNames();

	@Model(adaptables = Resource.class)
	interface Name {

		@ValueMapValue(name = "firstname")
		String getFirstName();

		@ValueMapValue(name = "lastname")
		String getLastName();
	}
}
