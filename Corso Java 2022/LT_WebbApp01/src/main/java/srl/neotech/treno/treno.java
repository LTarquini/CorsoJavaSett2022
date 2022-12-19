package srl.neotech.treno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class treno {

    @Autowired
    private Motore gt;

	public Motore getGt() {
		return gt;
	}

	public void setGt(Motore gt) {
		this.gt = gt;
	}

}