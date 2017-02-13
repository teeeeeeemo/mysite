package com.bit2017.mysite.web.main;

import com.bit2017.web.Action;
import com.bit2017.web.ActionFactory;

public class MainActionFactory extends ActionFactory{
	@Override
	public Action getAction(String actionName) {
		return new IndexAction();
	}

}
