package com.adapit.portal.services.local;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.adapit.portal.entidades.Categoria;
import com.adapit.portal.entidades.ComercialSolution;
import com.adapit.portal.entidades.ComercialSolutionHistory;
import com.adapit.portal.entidades.ComercialSolutionItem;
import com.adapit.portal.entidades.CommercialSolutionDetailTab;
import com.adapit.portal.entidades.CssDefinition;
import com.adapit.portal.entidades.FormacaoTreinamento;
import com.adapit.portal.entidades.Imagem;
import com.adapit.portal.entidades.Participante;
import com.adapit.portal.entidades.SoftwareDomainInterest;
import com.adapit.portal.entidades.SoftwareSolution;
import com.adapit.portal.entidades.TrainingFormationItem;
import com.adapit.portal.entidades.TrainingSolution;
import com.adapit.portal.entidades.Treinamento;
import com.adapit.portal.services.ComercialSolutionService;
import com.adapit.portal.services.ScheduleScheduledTrainingFilterType;
import com.adapit.portal.services.StringQueryKind;
import com.adapit.portal.services.dao.hibernate.ComercialSolutionServiceDAOHibernate;

public class LocalComercialSolutionService implements ComercialSolutionService {

	private ComercialSolutionService comercialSolutionService;

	private static LocalComercialSolutionService instance;

	private LocalComercialSolutionService() {
		try {
			XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("localServices.xml"));
			comercialSolutionService = (ComercialSolutionService) beanFactory.getBean("comercialSolutionServiceDAOHibernate");//new LoteServiceDAOHibernate();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static LocalComercialSolutionService getInstance() {
		if (instance == null) {
			instance = new LocalComercialSolutionService();
		}
		return instance;
	}

	/**
	 * Retorna todos os comercialSolutions em que a descri��o contenha o valor passado
	 * como argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByWithName(String descricao) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByWithName(descricao);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna o comercialSolution em que a descri��o inicia pelo valor passado como
	 * argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByNameBeginingWith(String descricao) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByNameBeginingWith(descricao);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna o comercialSolution em que a descri��o termina pelo valor passado como
	 * argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByNameEndingWith(String descricao) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByNameEndingWith(descricao);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna o comercialSolution em que a descri��o � igual ao valor passado como
	 * argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByDescription(String descricao) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByDescription(descricao);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna todos os comercialSolutions em que a categoria � igual ao id passado como
	 * argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByIdCategory(int id) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByIdCategory(id);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna todos os comercialSolutions em que a avalia��o esteja na faixa de valores
	 * passados como argumento
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listCommercialSolutionsByValueRange(float valorA, float valorB) {
		try {
			return this.comercialSolutionService.listCommercialSolutionsByValueRange(valorA, valorB);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna todos os comercialSolutions j� loteados
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listScheduledTrainingSolutions() {
		try {
			return this.comercialSolutionService.listScheduledTrainingSolutions();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna todos os comercialSolutions n�o loteados
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listNotScheduledTrainingSolutions() {
		try {
			return this.comercialSolutionService.listNotScheduledTrainingSolutions();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Retorna todos os comercialSolutions que estejam de acordo com a consulta
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List listTrainingSolutionsAccordingTo(String descricao, StringQueryKind descKind,
			Categoria categoria, float valorInic, float valorFin,
			ScheduleScheduledTrainingFilterType loteKind, int firstResult) {
		try {
			return this.comercialSolutionService.listTrainingSolutionsAccordingTo(descricao, descKind,
					categoria, valorInic, valorFin, loteKind,firstResult);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}
	
	@Override
	public Integer countTrainingSolutionsAccordingTo(String descricao, StringQueryKind descKind,
			Categoria categoria, float valorInic, float valorFin,
			ScheduleScheduledTrainingFilterType loteKind) {
		try {
			return this.comercialSolutionService.countTrainingSolutionsAccordingTo(descricao, descKind,
					categoria, valorInic, valorFin, loteKind);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List listAll() {
		try {
			return this.comercialSolutionService.listAll();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	@Override
	public ComercialSolution saveOrUpdate(ComercialSolution comercialSolution) throws Exception {
		try {
			return this.comercialSolutionService.saveOrUpdate(comercialSolution);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	/**
	 * Remove o comercialSolution que cont�m o identificador passado como argumento
	 */
	@Override
	public ComercialSolution deleteById(int id) throws Exception {
		try {
			return this.comercialSolutionService.deleteById(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("RemoteComercialSolutionService_deleteByIdError");
		}
	}

	/**
	 * Remove todos os comercialSolutions que perten�am a um lote
	 */
	@Override
	public ComercialSolution deleteByTrainingSolutionItemId(int id) throws Exception {
		try {
			return this.comercialSolutionService.deleteByTrainingSolutionItemId(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("RemoteComercialSolutionService_deleteByIdLoteError");
		}
	}

	/**
	 * Remove todos os comercialSolutions de uma determinada categoria
	 */
	@Override
	public ComercialSolution deleteByIdCategoria(int id) throws Exception {
		try {
			return this.comercialSolutionService.deleteByIdCategoria(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("RemoteComercialSolutionService_deleteByIdCategoriaError");
		}
	}

	/**
	 * Retorna um comercialSolution pelo identificador
	 */
	@Override
	public ComercialSolution getCommercialSolutionById(int id) throws Exception {
		try {
			return this.comercialSolutionService.getCommercialSolutionById(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("RemoteComercialSolutionService_getComercialSolutionByIdError");
		}
	}

	/**
	 * Retorna um comercialSolution pela descri��o
	 */
	@Override
	public ComercialSolution getCommercialSolutionByName(String descricao) throws Exception {
		try {
			return this.comercialSolutionService.getCommercialSolutionByName(descricao);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception(
					"RemoteComercialSolutionService_getComercialSolutionByDescricaoError");
		}
	}
	

	public ComercialSolution getComercialSolutionByIdCascadingProperties(int id, boolean images, boolean categoria, boolean itemComercialSolution) throws Exception {
		try {
			return ((ComercialSolutionServiceDAOHibernate)this.comercialSolutionService).getCommercialSolutionByIdCascadingProperties(id,images,categoria,itemComercialSolution);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception(
					"RemoteComercialSolutionService_getComercialSolutionByDescricaoError");
		}
	}

	@Override
	public ComercialSolution getCommercialSolutionByIdCascadingProperties(Serializable id,
			boolean images, boolean categoria, boolean itemComercialSolution)
			throws Exception {
		return comercialSolutionService.getCommercialSolutionByIdCascadingProperties(id, images, categoria, itemComercialSolution);
	}

	@Override
	public TrainingSolution mergeCascadingProperties(TrainingSolution comercialSolution, boolean images,
			boolean categoria, boolean itemComercialSolution) throws Exception {
		return comercialSolutionService.mergeCascadingProperties(comercialSolution, images, categoria, itemComercialSolution);
	}
	
	@Override
	public Imagem removeImageFromCommercialSolution(int idProd, int idImg)
			throws Exception {
		return comercialSolutionService.removeImageFromCommercialSolution(idProd, idImg);
	}

	@Override
	public ComercialSolution loadCommercialSolutionEagerImages(ComercialSolution comercialSolution) throws Exception {
		return comercialSolutionService.loadCommercialSolutionEagerImages(comercialSolution);
	}

	@Override
	public ComercialSolution attachImageIntoCommercialSolution(ComercialSolution comercialSolution,
			List<Imagem> selectedImgs) throws Exception {
		return comercialSolutionService.attachImageIntoCommercialSolution(comercialSolution, selectedImgs);
	}
	
	@Override
	public ComercialSolutionHistory generateTrainingSolutionHistory(TrainingSolution comercialSolution, Treinamento lote,
			ComercialSolutionItem ip, boolean apagarComercialSolution) throws Exception {
		return comercialSolutionService.generateTrainingSolutionHistory(comercialSolution, lote, ip, apagarComercialSolution);
	}

	@Override
	public ComercialSolutionItem removeTrainingSolutionItemFromScheduledTrainig(ComercialSolutionItem ip)
			throws Exception {
		return comercialSolutionService.removeTrainingSolutionItemFromScheduledTrainig(ip);
	}

	@Override
	public void deleteCommercialSolutionById(int id, ComercialSolution p) throws Exception {
		comercialSolutionService.deleteCommercialSolutionById(id,p);
	}

	@Override
	public ComercialSolutionItem saveOrUpdateComercialSolutionItem(
			ComercialSolutionItem ip, Participante cliente,
			Treinamento treinAgendadod) throws Exception {
		return comercialSolutionService.saveOrUpdateComercialSolutionItem(ip, cliente, treinAgendadod);
	}

	@Override
	public TrainingFormationItem saveOrUpdateComercialSolutionItem(TrainingFormationItem ip, TrainingSolution solution, FormacaoTreinamento formacao) throws Exception {
		return comercialSolutionService.saveOrUpdateComercialSolutionItem(ip, solution, formacao);
	}

	@Override
	public List<ComercialSolution> listCommercialSolutionsAccordingTo(String descricao,
			StringQueryKind descKind, Categoria categoria, float valorInic,
			float valorFin, int firstResult) {
		return comercialSolutionService.listCommercialSolutionsAccordingTo(descricao, descKind, categoria, valorInic, valorFin, firstResult);
	}


	@Override
	public Integer countCommercialSolutionsAccordingTo(String descricao, StringQueryKind descKind,
			Categoria categoria, float valorInic, float valorFin) {
		return comercialSolutionService.countCommercialSolutionsAccordingTo(descricao, descKind, categoria, valorInic, valorFin);
	}
	
	@Override
	public SoftwareSolution getSoftwareSolutionByIdCascadingProperties(
			Serializable id, boolean images, boolean categoria)
			throws Exception {
		return comercialSolutionService.getSoftwareSolutionByIdCascadingProperties(id, images, categoria);
	}

	@Override
	public TrainingSolution getTrainingSolutionByIdCascadingProperties(
			Serializable id, boolean images, boolean categoria, boolean instr)
			throws Exception {
		return comercialSolutionService.getTrainingSolutionByIdCascadingProperties(id, images, categoria, instr);
	}
	
	@Override
	public List<SoftwareSolution> listSoftwareSolutionsAccordingTo(String descricao,
			StringQueryKind descKind, Categoria categoria, float valorInic,
			float valorFin, int firstResult) {
		return comercialSolutionService.listSoftwareSolutionsAccordingTo(descricao, descKind, categoria, valorInic, valorFin, firstResult);
	}
	
	@Override
	public Integer countSoftwareSolutionsAccordingTo(String descricao, StringQueryKind descKind,
			Categoria categoria, float valorInic, float valorFin) {
		return comercialSolutionService.countSoftwareSolutionsAccordingTo(descricao, descKind, categoria, valorInic, valorFin);
	}

	@Override
	public void publishComercialSolutionBySolutionId(int id, boolean value)	throws Exception {
		comercialSolutionService.publishComercialSolutionBySolutionId(id, value);
	}

	@Override
	public ComercialSolution mergeCascadingProperties(
			ComercialSolution solution, boolean images, boolean categoria)
			throws Exception {
		return comercialSolutionService.mergeCascadingProperties(solution, images, categoria);
	}

	@Override
	public List<CommercialSolutionDetailTab> listTabsByCommercialSolutionId(
			int id, String lang) throws Exception {
		return comercialSolutionService.listTabsByCommercialSolutionId(id, lang);
	}
	
	@Override
	public SoftwareDomainInterest getSoftwareDomainInterestByName(String name)
			throws Exception {
		return comercialSolutionService.getSoftwareDomainInterestByName(name);
	}

	@Override
	public List<SoftwareDomainInterest> listAllSoftwareDomainInterest(Integer swid, String sigle)
			throws Exception {
		return comercialSolutionService.listAllSoftwareDomainInterest(swid,sigle);
	}

	@Override
	public List<SoftwareSolution> listSoftwaresByDomainName(String name, Boolean pub)
			throws Exception {
		return comercialSolutionService.listSoftwaresByDomainName(name,pub);
	}

	@Override
	public SoftwareDomainInterest merge(SoftwareDomainInterest domain,
			SoftwareSolution ss) throws Exception {
		return comercialSolutionService.merge(domain, ss);
	}

	@Override
	public SoftwareDomainInterest unmerge(SoftwareDomainInterest domain,
			SoftwareSolution ss) throws Exception {
		return comercialSolutionService.unmerge(domain, ss);
	}
	
	@Override
	public CssDefinition getCssDefinition(ComercialSolution solution)
			throws Exception {
		return comercialSolutionService.getCssDefinition(solution);
	}

	@Override
	public List<CssDefinition> listCssDefinitions(String name) throws Exception {
		return comercialSolutionService.listCssDefinitions(name);
	}

	@Override
	public void merge(ComercialSolution solution, CssDefinition css,
			boolean merge) throws Exception {
		comercialSolutionService.merge(solution, css, merge);
	}

	@Override
	public CssDefinition saveOrUpdate(CssDefinition css) throws Exception {
		return comercialSolutionService.saveOrUpdate(css);
	}

	@Override
	public void generateHtmlCatalog(SoftwareDomainInterest domain)
			throws Exception {
		comercialSolutionService.generateHtmlCatalog(domain);
	}
}