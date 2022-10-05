package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Universidad;
import pe.idat.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {
	
	@Autowired
	private UniversidadRepository repositorio;

	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.save(universidad);

	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(universidad);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Universidad> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Universidad obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
